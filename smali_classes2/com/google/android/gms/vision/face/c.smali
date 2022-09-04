.class public final Lcom/google/android/gms/vision/face/c;
.super Ljava/lang/Object;


# static fields
.field public static final a:I = 0x0

.field public static final b:I = 0x1

.field public static final c:I = 0x2

.field public static final d:I = 0x3

.field public static final e:I = 0x4

.field public static final f:I = 0x5

.field public static final g:I = 0x6

.field public static final h:I = 0x7

.field public static final i:I = 0x8

.field public static final j:I = 0x9

.field public static final k:I = 0xa

.field public static final l:I = 0xb


# instance fields
.field private final m:Landroid/graphics/PointF;

.field private final n:I


# direct methods
.method public constructor <init>(Landroid/graphics/PointF;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/vision/face/c;->m:Landroid/graphics/PointF;

    iput p2, p0, Lcom/google/android/gms/vision/face/c;->n:I

    return-void
.end method


# virtual methods
.method public a()Landroid/graphics/PointF;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/face/c;->m:Landroid/graphics/PointF;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/vision/face/c;->n:I

    return v0
.end method
