.class public Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Inclusion"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;

.field private final e:Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/internal/b;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/internal/b;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IIILcom/google/android/gms/contextmanager/internal/TimeFilterImpl;Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->a:I

    iput p2, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->b:I

    iput p3, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->c:I

    iput-object p4, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->d:Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;

    iput-object p5, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->e:Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl;

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->a:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->b:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->c:I

    return v0
.end method

.method public d()Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->d:Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;

    return-object v0
.end method

.method public e()Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->e:Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;

    iget v2, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->b:I

    invoke-virtual {p1}, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->b()I

    move-result v3

    if-ne v2, v3, :cond_3

    iget v2, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->c:I

    invoke-virtual {p1}, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->c()I

    move-result v3

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->d:Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;

    invoke-virtual {p1}, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->d()Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->e:Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl;

    invoke-virtual {p1}, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->e()Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->d:Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->e:Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/contextmanager/internal/b;->a(Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;Landroid/os/Parcel;I)V

    return-void
.end method
