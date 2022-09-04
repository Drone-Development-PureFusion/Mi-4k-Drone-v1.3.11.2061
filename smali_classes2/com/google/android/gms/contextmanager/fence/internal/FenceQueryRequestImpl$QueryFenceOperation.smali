.class public Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "QueryFenceOperation"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/o;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/fence/internal/o;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;->a:I

    iput p2, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;->b:I

    iput-object p3, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;->c:Ljava/util/List;

    return-void
.end method

.method private constructor <init>(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;-><init>(IILjava/util/List;)V

    return-void
.end method

.method public static a(ILjava/util/List;)Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;-><init>(ILjava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;->b:I

    return v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;->c:Ljava/util/List;

    return-object v0
.end method

.method c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;->a:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/contextmanager/fence/internal/o;->a(Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl$QueryFenceOperation;Landroid/os/Parcel;I)V

    return-void
.end method
