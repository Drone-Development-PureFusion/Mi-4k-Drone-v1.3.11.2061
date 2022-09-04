.class public Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/a;


# instance fields
.field final a:I

.field private final b:Lcom/google/android/gms/nearby/bootstrap/Device;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Lcom/google/android/gms/internal/amz;

.field private final f:Lcom/google/android/gms/internal/ana;

.field private final g:Lcom/google/android/gms/internal/anb;

.field private final h:B

.field private final i:J

.field private final j:Ljava/lang/String;

.field private final k:B

.field private final l:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/bootstrap/request/a;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/bootstrap/request/a;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/a;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/nearby/bootstrap/Device;Ljava/lang/String;Ljava/lang/String;BJLjava/lang/String;BBLandroid/os/IBinder;Landroid/os/IBinder;Landroid/os/IBinder;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->a:I

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/bootstrap/Device;

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->b:Lcom/google/android/gms/nearby/bootstrap/Device;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->c:Ljava/lang/String;

    invoke-static {p4}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->d:Ljava/lang/String;

    iput-byte p5, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->h:B

    iput-wide p6, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->i:J

    iput-byte p9, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->k:B

    iput-byte p10, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->l:B

    iput-object p8, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->j:Ljava/lang/String;

    invoke-static {p11}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p11}, Lcom/google/android/gms/internal/amz$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/amz;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->e:Lcom/google/android/gms/internal/amz;

    invoke-static {p12}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p12}, Lcom/google/android/gms/internal/ana$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ana;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->f:Lcom/google/android/gms/internal/ana;

    invoke-static {p13}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p13}, Lcom/google/android/gms/internal/anb$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/anb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->g:Lcom/google/android/gms/internal/anb;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/nearby/bootstrap/Device;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->b:Lcom/google/android/gms/nearby/bootstrap/Device;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->d:Ljava/lang/String;

    return-object v0
.end method

.method public d()B
    .locals 1

    iget-byte v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->h:B

    return v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->i:J

    return-wide v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->j:Ljava/lang/String;

    return-object v0
.end method

.method public g()B
    .locals 1

    iget-byte v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->k:B

    return v0
.end method

.method public h()B
    .locals 1

    iget-byte v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->l:B

    return v0
.end method

.method public i()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->e:Lcom/google/android/gms/internal/amz;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->e:Lcom/google/android/gms/internal/amz;

    invoke-interface {v0}, Lcom/google/android/gms/internal/amz;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public j()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->f:Lcom/google/android/gms/internal/ana;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->f:Lcom/google/android/gms/internal/ana;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ana;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public k()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->g:Lcom/google/android/gms/internal/anb;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->g:Lcom/google/android/gms/internal/anb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/anb;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/a;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/bootstrap/request/a;->a(Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;Landroid/os/Parcel;I)V

    return-void
.end method
