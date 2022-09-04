.class public Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Field;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/android/gms/internal/akz;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/w;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/w;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/util/List;Landroid/os/IBinder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Field;",
            ">;",
            "Landroid/os/IBinder;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->a:I

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->b:Ljava/lang/String;

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->c:Ljava/util/List;

    invoke-static {p4}, Lcom/google/android/gms/internal/akz$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/akz;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->d:Lcom/google/android/gms/internal/akz;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;)V
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;->a(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;->b(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/internal/akz;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;-><init>(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;Lcom/google/android/gms/internal/akz;)V
    .locals 2

    iget-object v0, p1, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->b:Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->c:Ljava/util/List;

    invoke-direct {p0, v0, v1, p2}, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/internal/akz;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/internal/akz;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Field;",
            ">;",
            "Lcom/google/android/gms/internal/akz;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->a:I

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->b:Ljava/lang/String;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->c:Ljava/util/List;

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->d:Lcom/google/android/gms/internal/akz;

    return-void
.end method

.method private a(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->b:Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->c:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->c:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Field;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->c:Ljava/util/List;

    return-object v0
.end method

.method public c()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->d:Lcom/google/android/gms/internal/akz;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->d:Lcom/google/android/gms/internal/akz;

    invoke-interface {v0}, Lcom/google/android/gms/internal/akz;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->a(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->b:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->c:Ljava/util/List;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "name"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "fields"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->c:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/c$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/w;->a(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;Landroid/os/Parcel;I)V

    return-void
.end method
