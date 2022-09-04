.class public Lcom/google/android/gms/measurement/internal/z;
.super Lcom/google/android/gms/measurement/internal/b;


# static fields
.field private static final a:Ljavax/security/auth/x500/X500Principal;


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:J

.field private h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljavax/security/auth/x500/X500Principal;

    const-string v1, "CN=Android Debug,O=Android,C=US"

    invoke-direct {v0, v1}, Ljavax/security/auth/x500/X500Principal;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/measurement/internal/z;->a:Ljavax/security/auth/x500/X500Principal;

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/measurement/internal/aj;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/b;-><init>(Lcom/google/android/gms/measurement/internal/aj;)V

    return-void
.end method


# virtual methods
.method A()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->c()V

    iget v0, p0, Lcom/google/android/gms/measurement/internal/z;->d:I

    return v0
.end method

.method B()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z;->e:Ljava/lang/String;

    return-object v0
.end method

.method C()J
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->y()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->M()J

    move-result-wide v0

    return-wide v0
.end method

.method D()J
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->c()V

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/z;->g:J

    return-wide v0
.end method

.method E()Z
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->q()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->q()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x40

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    if-eqz v1, :cond_0

    iget-object v1, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    array-length v1, v1

    if-lez v1, :cond_0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    const-string v1, "X.509"

    invoke-static {v1}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v1

    new-instance v2, Ljava/io/ByteArrayInputStream;

    invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v1, v2}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/measurement/internal/z;->a:Ljavax/security/auth/x500/X500Principal;

    invoke-virtual {v0, v1}, Ljavax/security/auth/x500/X500Principal;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v1

    const-string v2, "Error obtaining certificate"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    :goto_1
    const/4 v0, 0x1

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v1

    const-string v2, "Package name not found"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1
.end method

.method a(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/AppMetadata;
    .locals 18

    new-instance v3, Lcom/google/android/gms/measurement/internal/AppMetadata;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/z;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/z;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/z;->z()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/z;->A()I

    move-result v2

    int-to-long v7, v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/z;->B()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/z;->C()J

    move-result-wide v10

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/z;->D()J

    move-result-wide v12

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/z;->n:Lcom/google/android/gms/measurement/internal/aj;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/aj;->E()Z

    move-result v15

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/z;->x()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v2

    iget-boolean v2, v2, Lcom/google/android/gms/measurement/internal/af;->m:Z

    if-nez v2, :cond_0

    const/16 v16, 0x1

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/z;->x()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/af;->g()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v14, p1

    invoke-direct/range {v3 .. v17}, Lcom/google/android/gms/measurement/internal/AppMetadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;)V

    return-object v3

    :cond_0
    const/16 v16, 0x0

    goto :goto_0
.end method

.method protected a(Lcom/google/android/gms/common/api/Status;)V
    .locals 4

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "GoogleService failed to initialize (no status)"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "GoogleService failed to initialize, status"

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->i()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method protected e()V
    .locals 11

    const/4 v5, 0x1

    const/4 v4, 0x0

    const-string v3, "unknown"

    const-string v2, "Unknown"

    const/high16 v1, -0x80000000

    const-string v0, "Unknown"

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->q()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->q()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v7

    if-nez v7, :cond_5

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v8

    const-string v9, "PackageManager is null, app identity information might be inaccurate"

    invoke-virtual {v8, v9}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :cond_0
    :goto_0
    iput-object v6, p0, Lcom/google/android/gms/measurement/internal/z;->b:Ljava/lang/String;

    iput-object v3, p0, Lcom/google/android/gms/measurement/internal/z;->e:Ljava/lang/String;

    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/z;->c:Ljava/lang/String;

    iput v1, p0, Lcom/google/android/gms/measurement/internal/z;->d:I

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/z;->f:Ljava/lang/String;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/z;->g:J

    const-string v0, "MD5"

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/m;->j(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Could not get MD5 instance"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/z;->g:J

    :cond_1
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->y()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->N()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->q()Landroid/content/Context;

    move-result-object v0

    const-string v1, "-"

    invoke-static {v0, v1, v5}, Lcom/google/android/gms/internal/aie;->a(Landroid/content/Context;Ljava/lang/String;Z)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    move-object v1, v0

    :goto_2
    if-eqz v1, :cond_b

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/Status;->f()Z

    move-result v0

    if-eqz v0, :cond_b

    move v0, v5

    :goto_3
    if-nez v0, :cond_2

    invoke-virtual {p0, v1}, Lcom/google/android/gms/measurement/internal/z;->a(Lcom/google/android/gms/common/api/Status;)V

    :cond_2
    if-eqz v0, :cond_f

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->y()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->Q()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->y()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/p;->P()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->C()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Collection disabled with firebase_analytics_collection_deactivated=1"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    move v0, v4

    :goto_4
    const-string v1, ""

    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/z;->h:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->y()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/p;->N()Z

    move-result v1

    if-nez v1, :cond_4

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/aie;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v1, ""

    :cond_3
    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/z;->h:Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "App package, google app id"

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/z;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/z;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2

    :cond_4
    :goto_5
    return-void

    :cond_5
    invoke-virtual {v7, v6}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_8

    const-string v3, "manual_install"

    :cond_6
    :goto_6
    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->q()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v7, v8, v9}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v8

    if-eqz v8, :cond_0

    iget-object v9, v8, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v7, v9}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v9

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_7

    invoke-interface {v9}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_7
    iget-object v2, v8, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iget v1, v8, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    :cond_8
    const-string v8, "com.android.vending"

    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const-string v3, ""

    goto :goto_6

    :catch_0
    move-exception v8

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v8

    const-string v9, "Error retrieving package info: appName"

    invoke-virtual {v8, v9, v0}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_9
    if-eqz v7, :cond_1

    :try_start_2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->E()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->q()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x40

    invoke-virtual {v7, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget-object v2, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    if-eqz v2, :cond_1

    iget-object v2, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    array-length v2, v2

    if-lez v2, :cond_1

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v1}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/m;->c([B)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/z;->g:J
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_1

    :catch_1
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v1

    const-string v2, "Package name not found"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_a
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->q()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/aie;->a(Landroid/content/Context;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    move-object v1, v0

    goto/16 :goto_2

    :cond_b
    move v0, v4

    goto/16 :goto_3

    :cond_c
    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_d

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->C()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Collection disabled with firebase_analytics_collection_enabled=0"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    move v0, v4

    goto/16 :goto_4

    :cond_d
    if-nez v0, :cond_e

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->y()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->R()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->C()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Collection disabled with google_app_measurement_enable=0"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    move v0, v4

    goto/16 :goto_4

    :cond_e
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Collection enabled"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    move v0, v5

    goto/16 :goto_4

    :catch_2
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v1

    const-string v2, "getGoogleAppId or isMeasurementEnabled failed with exception"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_f
    move v0, v4

    goto/16 :goto_4
.end method

.method f()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z;->b:Ljava/lang/String;

    return-object v0
.end method

.method g()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z;->h:Ljava/lang/String;

    return-object v0
.end method

.method public bridge synthetic h()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->h()V

    return-void
.end method

.method public bridge synthetic i()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->i()V

    return-void
.end method

.method public bridge synthetic j()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->j()V

    return-void
.end method

.method public bridge synthetic k()Lcom/google/android/gms/measurement/internal/o;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->k()Lcom/google/android/gms/measurement/internal/o;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l()Lcom/google/android/gms/measurement/internal/d;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->l()Lcom/google/android/gms/measurement/internal/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic m()Lcom/google/android/gms/measurement/internal/z;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->m()Lcom/google/android/gms/measurement/internal/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic n()Lcom/google/android/gms/measurement/internal/s;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->n()Lcom/google/android/gms/measurement/internal/s;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o()Lcom/google/android/gms/measurement/internal/e;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->o()Lcom/google/android/gms/measurement/internal/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p()Lcom/google/android/gms/common/util/e;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->p()Lcom/google/android/gms/common/util/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic q()Landroid/content/Context;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->q()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic r()Lcom/google/android/gms/measurement/internal/q;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->r()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic s()Lcom/google/android/gms/measurement/internal/m;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->s()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic t()Lcom/google/android/gms/measurement/internal/ah;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->t()Lcom/google/android/gms/measurement/internal/ah;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic u()Lcom/google/android/gms/measurement/internal/g;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->u()Lcom/google/android/gms/measurement/internal/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic v()Lcom/google/android/gms/measurement/internal/ai;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->v()Lcom/google/android/gms/measurement/internal/ai;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic w()Lcom/google/android/gms/measurement/internal/ab;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic x()Lcom/google/android/gms/measurement/internal/af;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->x()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic y()Lcom/google/android/gms/measurement/internal/p;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->y()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    return-object v0
.end method

.method z()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/z;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/z;->c:Ljava/lang/String;

    return-object v0
.end method
