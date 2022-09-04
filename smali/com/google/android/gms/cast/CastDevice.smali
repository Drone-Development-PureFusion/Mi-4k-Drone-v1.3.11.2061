.class public Lcom/google/android/gms/cast/CastDevice;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/cast/CastDevice;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:I = 0x1

.field public static final b:I = 0x2

.field public static final c:I = 0x4

.field public static final d:I = 0x8

.field public static final e:I = 0x20


# instance fields
.field f:Ljava/lang/String;

.field private final g:I

.field private h:Ljava/lang/String;

.field private i:Ljava/net/Inet4Address;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:I

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/common/images/WebImage;",
            ">;"
        }
    .end annotation
.end field

.field private o:I

.field private p:I

.field private q:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/cast/j;

    invoke-direct {v0}, Lcom/google/android/gms/cast/j;-><init>()V

    sput-object v0, Lcom/google/android/gms/cast/CastDevice;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;IILjava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/common/images/WebImage;",
            ">;II",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/cast/CastDevice;->g:I

    invoke-static {p2}, Lcom/google/android/gms/cast/CastDevice;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/cast/CastDevice;->h:Ljava/lang/String;

    invoke-static {p3}, Lcom/google/android/gms/cast/CastDevice;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/cast/CastDevice;->f:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/cast/CastDevice;->f:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/cast/CastDevice;->f:Ljava/lang/String;

    invoke-static {v1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v1

    instance-of v2, v1, Ljava/net/Inet4Address;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/net/Inet4Address;

    iput-object v1, p0, Lcom/google/android/gms/cast/CastDevice;->i:Ljava/net/Inet4Address;
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    invoke-static {p4}, Lcom/google/android/gms/cast/CastDevice;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/cast/CastDevice;->j:Ljava/lang/String;

    invoke-static {p5}, Lcom/google/android/gms/cast/CastDevice;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/cast/CastDevice;->k:Ljava/lang/String;

    invoke-static {p6}, Lcom/google/android/gms/cast/CastDevice;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/cast/CastDevice;->l:Ljava/lang/String;

    iput p7, p0, Lcom/google/android/gms/cast/CastDevice;->m:I

    if-eqz p8, :cond_1

    :goto_1
    iput-object p8, p0, Lcom/google/android/gms/cast/CastDevice;->n:Ljava/util/List;

    move/from16 v0, p9

    iput v0, p0, Lcom/google/android/gms/cast/CastDevice;->o:I

    move/from16 v0, p10

    iput v0, p0, Lcom/google/android/gms/cast/CastDevice;->p:I

    invoke-static/range {p11 .. p11}, Lcom/google/android/gms/cast/CastDevice;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/cast/CastDevice;->q:Ljava/lang/String;

    return-void

    :catch_0
    move-exception v1

    const-string v2, "CastDevice"

    iget-object v3, p0, Lcom/google/android/gms/cast/CastDevice;->f:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/net/UnknownHostException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x30

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "Unable to convert host address ("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ") to ipaddress: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    new-instance p8, Ljava/util/ArrayList;

    invoke-direct {p8}, Ljava/util/ArrayList;-><init>()V

    goto :goto_1
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    return-object p0
.end method

.method public static b(Landroid/os/Bundle;)Lcom/google/android/gms/cast/CastDevice;
    .locals 1

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    const-class v0, Lcom/google/android/gms/cast/CastDevice;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string v0, "com.google.android.gms.cast.EXTRA_CAST_DEVICE"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/CastDevice;

    goto :goto_0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/CastDevice;->g:I

    return v0
.end method

.method public a(II)Lcom/google/android/gms/common/images/WebImage;
    .locals 9

    const/4 v7, 0x0

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object v1

    :cond_0
    if-lez p1, :cond_1

    if-gtz p2, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->n:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/images/WebImage;

    move-object v1, v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v2, v1

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/images/WebImage;

    invoke-virtual {v0}, Lcom/google/android/gms/common/images/WebImage;->c()I

    move-result v4

    invoke-virtual {v0}, Lcom/google/android/gms/common/images/WebImage;->d()I

    move-result v5

    if-lt v4, p1, :cond_4

    if-lt v5, p2, :cond_4

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/google/android/gms/common/images/WebImage;->c()I

    move-result v6

    if-le v6, v4, :cond_9

    invoke-virtual {v2}, Lcom/google/android/gms/common/images/WebImage;->d()I

    move-result v4

    if-le v4, v5, :cond_9

    :cond_3
    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    :goto_2
    move-object v2, v1

    move-object v1, v0

    goto :goto_1

    :cond_4
    if-ge v4, p1, :cond_9

    if-ge v5, p2, :cond_9

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/google/android/gms/common/images/WebImage;->c()I

    move-result v6

    if-ge v6, v4, :cond_9

    invoke-virtual {v1}, Lcom/google/android/gms/common/images/WebImage;->d()I

    move-result v4

    if-ge v4, v5, :cond_9

    :cond_5
    move-object v1, v2

    goto :goto_2

    :cond_6
    if-eqz v2, :cond_7

    :goto_3
    move-object v1, v2

    goto :goto_0

    :cond_7
    if-eqz v1, :cond_8

    move-object v2, v1

    goto :goto_3

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->n:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/images/WebImage;

    move-object v2, v0

    goto :goto_3

    :cond_9
    move-object v0, v1

    move-object v1, v2

    goto :goto_2
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 1

    if-nez p1, :cond_0

    :goto_0
    return-void

    :cond_0
    const-string v0, "com.google.android.gms.cast.EXTRA_CAST_DEVICE"

    invoke-virtual {p1, v0, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_0
.end method

.method public a(I)Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/CastDevice;->o:I

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/cast/CastDevice;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/cast/CastDevice;->h:Ljava/lang/String;

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/google/android/gms/cast/CastDevice;->h:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->h:Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/cast/CastDevice;->h:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public a([I)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    array-length v2, p1

    move v1, v0

    :goto_1
    if-ge v1, v2, :cond_2

    aget v3, p1, v1

    invoke-virtual {p0, v3}, Lcom/google/android/gms/cast/CastDevice;->a(I)Z

    move-result v3

    if-eqz v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public b()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->h:Ljava/lang/String;

    const-string v1, "__cast_nearby__"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->h:Ljava/lang/String;

    const-string v1, "__cast_nearby__"

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->h:Ljava/lang/String;

    goto :goto_0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->h:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/net/Inet4Address;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->i:Ljava/net/Inet4Address;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->j:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, p0, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/cast/CastDevice;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/cast/CastDevice;

    iget-object v2, p0, Lcom/google/android/gms/cast/CastDevice;->h:Ljava/lang/String;

    if-nez v2, :cond_3

    iget-object v2, p1, Lcom/google/android/gms/cast/CastDevice;->h:Ljava/lang/String;

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_3
    iget-object v2, p0, Lcom/google/android/gms/cast/CastDevice;->h:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/cast/CastDevice;->h:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/cast/CastDevice;->i:Ljava/net/Inet4Address;

    iget-object v3, p1, Lcom/google/android/gms/cast/CastDevice;->i:Ljava/net/Inet4Address;

    invoke-static {v2, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/cast/CastDevice;->k:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/cast/CastDevice;->k:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/cast/CastDevice;->j:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/cast/CastDevice;->j:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/cast/CastDevice;->l:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/cast/CastDevice;->l:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget v2, p0, Lcom/google/android/gms/cast/CastDevice;->m:I

    iget v3, p1, Lcom/google/android/gms/cast/CastDevice;->m:I

    if-ne v2, v3, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/cast/CastDevice;->n:Ljava/util/List;

    iget-object v3, p1, Lcom/google/android/gms/cast/CastDevice;->n:Ljava/util/List;

    invoke-static {v2, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget v2, p0, Lcom/google/android/gms/cast/CastDevice;->o:I

    iget v3, p1, Lcom/google/android/gms/cast/CastDevice;->o:I

    if-ne v2, v3, :cond_4

    iget v2, p0, Lcom/google/android/gms/cast/CastDevice;->p:I

    iget v3, p1, Lcom/google/android/gms/cast/CastDevice;->p:I

    if-ne v2, v3, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/cast/CastDevice;->q:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/cast/CastDevice;->q:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_4
    move v0, v1

    goto :goto_0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->k:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->l:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->q:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->h:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/CastDevice;->m:I

    return v0
.end method

.method public j()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/common/images/WebImage;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->n:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public k()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public l()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/CastDevice;->o:I

    return v0
.end method

.method public m()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/CastDevice;->p:I

    return v0
.end method

.method public n()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->h:Ljava/lang/String;

    const-string v1, "__cast_nearby__"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "\"%s\" (%s)"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/cast/CastDevice;->j:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/google/android/gms/cast/CastDevice;->h:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/cast/j;->a(Lcom/google/android/gms/cast/CastDevice;Landroid/os/Parcel;I)V

    return-void
.end method
