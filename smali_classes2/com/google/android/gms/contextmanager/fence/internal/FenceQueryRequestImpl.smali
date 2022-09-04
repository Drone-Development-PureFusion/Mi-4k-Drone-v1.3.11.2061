.class public Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;
.super Lcom/google/android/gms/awareness/fence/FenceQueryRequest;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/h;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/fence/internal/h;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x1

    const/4 v0, 0x0

    invoke-static {v1, v0}, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;->a(ILjava/util/List;)Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;-><init>(ILcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;)V

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/awareness/fence/FenceQueryRequest;-><init>()V

    iput p1, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;->a:I

    iput-object p2, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;->b:Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x2

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1, v2}, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;->a(ILjava/util/List;)Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;-><init>(ILcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;)V

    return-void
.end method

.method public varargs constructor <init>([Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;->a(ILjava/util/List;)Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;-><init>(ILcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;)V

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;->a:I

    return v0
.end method

.method public c()Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;->b:Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/contextmanager/fence/internal/h;->a(Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;Landroid/os/Parcel;I)V

    return-void
.end method
