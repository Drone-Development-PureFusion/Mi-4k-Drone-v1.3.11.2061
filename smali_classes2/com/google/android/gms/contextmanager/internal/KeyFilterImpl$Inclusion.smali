.class public Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl;
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
            "Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:[Ljava/lang/String;

.field private final c:[Ljava/lang/String;

.field private final d:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/internal/m;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/internal/m;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(I[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;->a:I

    iput-object p2, p0, Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;->b:[Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;->c:[Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;->d:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;->a:I

    return v0
.end method

.method public b()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;->b:[Ljava/lang/String;

    return-object v0
.end method

.method public c()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;->c:[Ljava/lang/String;

    return-object v0
.end method

.method public d()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;->d:[Ljava/lang/String;

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
    instance-of v2, p1, Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;->b()[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;->b()[Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;->c()[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;->c()[Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;->d()[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;->d()[Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;->b:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;->c:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;->d:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/contextmanager/internal/m;->a(Lcom/google/android/gms/contextmanager/internal/KeyFilterImpl$Inclusion;Landroid/os/Parcel;I)V

    return-void
.end method
