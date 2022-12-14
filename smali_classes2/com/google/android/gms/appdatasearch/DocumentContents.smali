.class public Lcom/google/android/gms/appdatasearch/DocumentContents;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/appdatasearch/DocumentContents$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/appdatasearch/b;


# instance fields
.field final a:I

.field final b:[Lcom/google/android/gms/appdatasearch/DocumentSection;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:Landroid/accounts/Account;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/appdatasearch/b;

    invoke-direct {v0}, Lcom/google/android/gms/appdatasearch/b;-><init>()V

    sput-object v0, Lcom/google/android/gms/appdatasearch/DocumentContents;->CREATOR:Lcom/google/android/gms/appdatasearch/b;

    return-void
.end method

.method constructor <init>(I[Lcom/google/android/gms/appdatasearch/DocumentSection;Ljava/lang/String;ZLandroid/accounts/Account;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/appdatasearch/DocumentContents;->a:I

    iput-object p2, p0, Lcom/google/android/gms/appdatasearch/DocumentContents;->b:[Lcom/google/android/gms/appdatasearch/DocumentSection;

    iput-object p3, p0, Lcom/google/android/gms/appdatasearch/DocumentContents;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/android/gms/appdatasearch/DocumentContents;->d:Z

    iput-object p5, p0, Lcom/google/android/gms/appdatasearch/DocumentContents;->e:Landroid/accounts/Account;

    return-void
.end method

.method varargs constructor <init>(Ljava/lang/String;ZLandroid/accounts/Account;[Lcom/google/android/gms/appdatasearch/DocumentSection;)V
    .locals 6

    const/4 v1, 0x1

    move-object v0, p0

    move-object v2, p4

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/appdatasearch/DocumentContents;-><init>(I[Lcom/google/android/gms/appdatasearch/DocumentSection;Ljava/lang/String;ZLandroid/accounts/Account;)V

    if-eqz p4, :cond_3

    new-instance v1, Ljava/util/BitSet;

    invoke-static {}, Lcom/google/android/gms/appdatasearch/h;->a()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/BitSet;-><init>(I)V

    const/4 v0, 0x0

    :goto_0
    array-length v2, p4

    if-ge v0, v2, :cond_3

    aget-object v2, p4, v0

    iget v2, v2, Lcom/google/android/gms/appdatasearch/DocumentSection;->e:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v3, "Duplicate global search section type "

    invoke-static {v2}, Lcom/google/android/gms/appdatasearch/h;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method


# virtual methods
.method public a()[Lcom/google/android/gms/appdatasearch/DocumentSection;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/appdatasearch/DocumentContents;->b:[Lcom/google/android/gms/appdatasearch/DocumentSection;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    instance-of v1, p1, Lcom/google/android/gms/appdatasearch/DocumentContents;

    if-eqz v1, :cond_0

    check-cast p1, Lcom/google/android/gms/appdatasearch/DocumentContents;

    iget-object v1, p0, Lcom/google/android/gms/appdatasearch/DocumentContents;->c:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/appdatasearch/DocumentContents;->c:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/google/android/gms/appdatasearch/DocumentContents;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v2, p1, Lcom/google/android/gms/appdatasearch/DocumentContents;->d:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/appdatasearch/DocumentContents;->e:Landroid/accounts/Account;

    iget-object v2, p1, Lcom/google/android/gms/appdatasearch/DocumentContents;->e:Landroid/accounts/Account;

    invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/appdatasearch/DocumentContents;->a()[Lcom/google/android/gms/appdatasearch/DocumentSection;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/appdatasearch/DocumentContents;->a()[Lcom/google/android/gms/appdatasearch/DocumentSection;

    move-result-object v2

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/appdatasearch/DocumentContents;->c:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-boolean v2, p0, Lcom/google/android/gms/appdatasearch/DocumentContents;->d:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/appdatasearch/DocumentContents;->e:Landroid/accounts/Account;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/appdatasearch/DocumentContents;->b:[Lcom/google/android/gms/appdatasearch/DocumentSection;

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/appdatasearch/DocumentContents;->CREATOR:Lcom/google/android/gms/appdatasearch/b;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/appdatasearch/b;->a(Lcom/google/android/gms/appdatasearch/DocumentContents;Landroid/os/Parcel;I)V

    return-void
.end method
