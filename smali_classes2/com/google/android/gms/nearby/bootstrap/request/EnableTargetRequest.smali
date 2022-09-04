.class public Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/e;


# instance fields
.field final a:I

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/google/android/gms/internal/amz;

.field private final e:Lcom/google/android/gms/internal/ana;

.field private final f:Lcom/google/android/gms/internal/anb;

.field private final g:B

.field private final h:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/bootstrap/request/e;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/bootstrap/request/e;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/e;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;BBLandroid/os/IBinder;Landroid/os/IBinder;Landroid/os/IBinder;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->a:I

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->b:Ljava/lang/String;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->c:Ljava/lang/String;

    iput-byte p4, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->g:B

    iput-byte p5, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->h:B

    invoke-static {p6}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p6}, Lcom/google/android/gms/internal/amz$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/amz;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->d:Lcom/google/android/gms/internal/amz;

    invoke-static {p7}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p7}, Lcom/google/android/gms/internal/ana$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ana;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->e:Lcom/google/android/gms/internal/ana;

    invoke-static {p8}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p8}, Lcom/google/android/gms/internal/anb$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/anb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->f:Lcom/google/android/gms/internal/anb;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()B
    .locals 1

    iget-byte v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->g:B

    return v0
.end method

.method public d()B
    .locals 1

    iget-byte v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->h:B

    return v0
.end method

.method public e()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->d:Lcom/google/android/gms/internal/amz;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->d:Lcom/google/android/gms/internal/amz;

    invoke-interface {v0}, Lcom/google/android/gms/internal/amz;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public f()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->e:Lcom/google/android/gms/internal/ana;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->e:Lcom/google/android/gms/internal/ana;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ana;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public g()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->f:Lcom/google/android/gms/internal/anb;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->f:Lcom/google/android/gms/internal/anb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/anb;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/e;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/bootstrap/request/e;->a(Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;Landroid/os/Parcel;I)V

    return-void
.end method
